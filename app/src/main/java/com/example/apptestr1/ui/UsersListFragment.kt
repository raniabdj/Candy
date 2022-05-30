package com.example.apptestr1.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.android.interviewtask.candyspace.model.UsersList
import com.example.apptestr1.R
import com.example.apptestr1.adapter.UserListAdapter
import com.example.apptestr1.databinding.FragmentUsersListBinding
import com.example.apptestr1.utiles.ARG_USERITEM
import com.example.apptestr1.utiles.Status
import com.example.apptestr1.utiles.showErrorMsg
import com.example.apptestr1.viewModels.UserViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UsersListFragment : Fragment() {

    private val binding by lazy{
        FragmentUsersListBinding.inflate(layoutInflater)
    }
    private val userViewModel: UserViewModel by viewModels<UserViewModel>()
    private lateinit var usersAdapter: UserListAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        usersAdapter=UserListAdapter()
        binding.rcvUserslist.adapter = usersAdapter
        userViewModel.usersLiveData.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Status.LOADING -> {
                    binding.progressBar.visibility = View.VISIBLE
                }
                is Status.SUCCESS -> {
                    binding.progressBar.visibility = View.GONE
                    val usersList = response.success as UsersList
                    usersAdapter.loadData(usersList.userItems)
                }
                is Status.ERROR -> {
                    binding.progressBar.visibility = View.GONE
                    showErrorMsg(binding.root, response.error.localizedMessage.toString())
                }
            }
        }
        binding.btnSearch.setOnClickListener{
            userViewModel.subscribeToUsersList(binding.edtSearch.text.toString())
        }
        usersAdapter.onItemClick={useritem ->
            val bundle=Bundle().apply{
                putSerializable(ARG_USERITEM,useritem)
            }
            findNavController().navigate(R.id.action_interviewtaskListFragment_to_interviewtaskDetailFragment,bundle)
        }
        userViewModel.subscribeToUsersList(binding.edtSearch.text.toString())

        return binding.root
    }
}