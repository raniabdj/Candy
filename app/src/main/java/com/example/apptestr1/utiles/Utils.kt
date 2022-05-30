package com.example.apptestr1.utiles


import android.view.View
import android.widget.ImageView
import com.android.interviewtask.candyspace.model.UsersList
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import com.squareup.picasso.Picasso
import java.text.SimpleDateFormat
import java.util.*


fun getOutputData():UsersList{
    val OUTPUT_STRING = "{\"items\":[{\"badge_counts\":{\"bronze\":8,\"silver\":1,\"gold\":0},\"account_id\":433288,\"is_employee\":false,\"last_modified_date\":1573683781,\"last_access_date\":1650433376,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":35,\"creation_date\":1309238312,\"user_type\":\"registered\",\"user_id\":818544,\"accept_rate\":50,\"location\":\"Thai\",\"website_url\":\"\",\"link\":\"https://stackoverflow.com/users/818544/%e1%b4%ba%e1%b4%b1%e1%b4%bc%e1%b4%ba\",\"profile_image\":\"https://www.gravatar.com/avatar/894891fa86576454f1cab28c28625425?s=256&d=identicon&r=PG\",\"display_name\":\"ᴺᴱᴼᴺ\"},{\"badge_counts\":{\"bronze\":1,\"silver\":0,\"gold\":0},\"account_id\":1807985,\"is_employee\":false,\"last_modified_date\":1573682110,\"last_access_date\":1346846006,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":21,\"creation_date\":1346708248,\"user_type\":\"registered\",\"user_id\":1644666,\"link\":\"https://stackoverflow.com/users/1644666/%e1%8b%88%e1%8a%95%e1%8b%b5%e1%8b%88%e1%88%b0%e1%8a%95-%e1%8a%a5%e1%88%ad%e1%8c%88%e1%8c%a4\",\"profile_image\":\"https://www.gravatar.com/avatar/3314c6781ca9db3eed19951546f9be4f?s=256&d=identicon&r=PG\",\"display_name\":\"ወንድወሰን እርገጤ\"},{\"badge_counts\":{\"bronze\":1,\"silver\":0,\"gold\":0},\"account_id\":2214217,\"is_employee\":false,\"last_modified_date\":1428289577,\"last_access_date\":1364094459,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":1,\"creation_date\":1357568743,\"user_type\":\"registered\",\"user_id\":1955288,\"link\":\"https://stackoverflow.com/users/1955288/%e1%a0%a8%e1%a0%a5%e1%a0%b6%e1%a0%a5%e1%a0%a8-%e1%a0%b5%e1%a0%a5%e1%a0%af%e1%a0%aa%e1%a0%a0%e1%a0%b6%e1%a0%a0%e1%a0%b7-%e1%a0%aa%e1%a0%a0%e1%a0%b6%e1%a0%a0%e1%a0%b7%e1%a0%b0%e1%a0%a0%e1%a0%a2%e1%a0%ac%e1%a0%a0%e1%a0%a8\",\"profile_image\":\"https://www.gravatar.com/avatar/fa52969552d4278f666fdaf40d3a9725?s=256&d=identicon&r=PG\",\"display_name\":\"ᠨᠥᠶᠥᠨ ᠵᠥᠯᠪᠠᠶᠠᠷ ᠪᠠᠶᠠᠷᠰᠠᠢᠬᠠᠨ\"},{\"badge_counts\":{\"bronze\":0,\"silver\":0,\"gold\":0},\"account_id\":2455633,\"is_employee\":false,\"last_modified_date\":1365247546,\"last_access_date\":1362588980,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":1,\"creation_date\":1362588980,\"user_type\":\"registered\",\"user_id\":2140934,\"link\":\"https://stackoverflow.com/users/2140934/%de%9d%de%a6%de%83%de%ab-%de%87%de%a8%de%84%de%b0%de%83%de%a7%de%80%de%a8%de%89%de%b0\",\"profile_image\":\"https://graph.facebook.com/100001709502523/picture?type=large\",\"display_name\":\"ޝަރޫ އިބްރާހިމް\"},{\"badge_counts\":{\"bronze\":6,\"silver\":1,\"gold\":0},\"account_id\":2486873,\"is_employee\":false,\"last_modified_date\":1483464853,\"last_access_date\":1650552250,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":93,\"creation_date\":1363173944,\"user_type\":\"registered\",\"user_id\":2165149,\"location\":\"Heap\",\"website_url\":\"http://www.flee.com\",\"link\":\"https://stackoverflow.com/users/2165149/%e1%b4%b3%e1%b4%bf%e1%b4%b5%e1%b4%b9%e1%b4%b9\",\"profile_image\":\"https://i.stack.imgur.com/wtrBv.png?s=256&g=1\",\"display_name\":\"ᴳᴿᴵᴹᴹ\"},{\"badge_counts\":{\"bronze\":1,\"silver\":0,\"gold\":0},\"account_id\":2546337,\"is_employee\":false,\"last_modified_date\":1617732300,\"last_access_date\":1619124132,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":1,\"creation_date\":1364292480,\"user_type\":\"registered\",\"user_id\":2211070,\"link\":\"https://stackoverflow.com/users/2211070/%e1%8b%ab%e1%88%ac%e1%8b%b5-%e1%8a%90%e1%8c%88%e1%8b%b0\",\"profile_image\":\"https://www.gravatar.com/avatar/57ada22af3ab8c83d3f179e074c5bd69?s=256&d=identicon&r=PG\",\"display_name\":\"ያሬድ ነገደ\"},{\"badge_counts\":{\"bronze\":0,\"silver\":0,\"gold\":0},\"account_id\":2811847,\"is_employee\":false,\"last_access_date\":1369408715,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":1,\"creation_date\":1369405981,\"user_type\":\"registered\",\"user_id\":2417926,\"link\":\"https://stackoverflow.com/users/2417926/%e1%8b%b5%e1%88%aa%e1%89%a3-%e1%8d%88%e1%8b%ad%e1%88%b3\",\"profile_image\":\"https://www.gravatar.com/avatar/6e957d5ae1d7e1de93c90345fa4f2add?s=256&d=identicon&r=PG\",\"display_name\":\"ድሪባ ፈይሳ\"},{\"badge_counts\":{\"bronze\":0,\"silver\":0,\"gold\":0},\"account_id\":2841927,\"is_employee\":false,\"last_access_date\":1372338162,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":1,\"creation_date\":1370020851,\"user_type\":\"registered\",\"user_id\":2441368,\"link\":\"https://stackoverflow.com/users/2441368/%e1%8b%b0%e1%88%ac-%e1%8b%98%e1%88%b2%e1%8a%93\",\"profile_image\":\"https://www.gravatar.com/avatar/aac94e3dba9895396f78645a9c15290d?s=256&d=identicon&r=PG\",\"display_name\":\"ደሬ ዘሲና\"},{\"badge_counts\":{\"bronze\":0,\"silver\":0,\"gold\":0},\"account_id\":2937277,\"is_employee\":false,\"last_access_date\":1463579416,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":1,\"creation_date\":1372070768,\"user_type\":\"registered\",\"user_id\":2515912,\"link\":\"https://stackoverflow.com/users/2515912/%dc%94%dc%9b%dc%94%dc%94%dc%9b%dc%94%dc%94%dc%94%dc%9b%dc%94%dc%94%dc%9b%dc%94%dc%94-%dc%94%dc%94%dc%9b%dc%94%dc%94%dc%94%dc%9b\",\"profile_image\":\"https://www.gravatar.com/avatar/cefd48323d1090054a2b60a95914c256?s=256&d=identicon&r=PG\",\"display_name\":\"ܔܛܔܔܛܔܔܔܛܔܔܛܔܔ ܔܔܛܔܔܔܛ\"},{\"badge_counts\":{\"bronze\":0,\"silver\":0,\"gold\":0},\"account_id\":3197995,\"is_employee\":false,\"last_access_date\":1377018355,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":1,\"creation_date\":1377017409,\"user_type\":\"registered\",\"user_id\":2700752,\"link\":\"https://stackoverflow.com/users/2700752/%e1%96%b4%e1%97%a9%e1%96%87%e1%94%95%e1%95%bc%e1%97%a9%e1%97%aa-%e1%96%b4%e1%97%a9%e1%92%aa%e1%92%aa%e1%97%a9%e1%95%bc\",\"profile_image\":\"https://graph.facebook.com/1788468017/picture?type=large\",\"display_name\":\"ᖴᗩᖇᔕᕼᗩᗪ ᖴᗩᒪᒪᗩᕼ\"},{\"badge_counts\":{\"bronze\":0,\"silver\":0,\"gold\":0},\"account_id\":3217277,\"is_employee\":false,\"last_modified_date\":1377441089,\"last_access_date\":1377440682,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":1,\"creation_date\":1377440682,\"user_type\":\"registered\",\"user_id\":2715617,\"website_url\":\"\",\"link\":\"https://stackoverflow.com/users/2715617/%dc%94%dc%94%dc%9b%dc%94%dc%94%dc%9b%dc%94-%dc%94%dc%94%dc%9b%dc%94%dc%94%dc%9b%dc%94-%dc%94%dc%94%dc%9b%dc%94%dc%94%dc%9b%dc%94\",\"profile_image\":\"https://i.stack.imgur.com/5ClNs.jpg?s=256&g=1\",\"display_name\":\"ܔܔܛܔܔܛܔ ܔܔܛܔܔܛܔ ܔܔܛܔܔܛܔ\"},{\"badge_counts\":{\"bronze\":7,\"silver\":0,\"gold\":0},\"account_id\":3308457,\"is_employee\":false,\"last_modified_date\":1573681044,\"last_access_date\":1650147790,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":49,\"creation_date\":1379300770,\"user_type\":\"registered\",\"user_id\":2782504,\"location\":\"Tempe, AZ, USA\",\"website_url\":\"\",\"link\":\"https://stackoverflow.com/users/2782504/%e1%9b%97%e1%9b%81%e1%9b%a3%e1%9b%96-%e1%9b%9f%e1%9b%81%e1%9a%be%e1%9b%8b\",\"profile_image\":\"https://i.stack.imgur.com/KQZZq.jpg?s=256&g=1\",\"display_name\":\"ᛗᛁᛣᛖ ᛟᛁᚾᛋ\"},{\"badge_counts\":{\"bronze\":0,\"silver\":0,\"gold\":0},\"account_id\":3440046,\"is_employee\":false,\"last_access_date\":1623849549,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":1,\"creation_date\":1381834700,\"user_type\":\"registered\",\"user_id\":2882213,\"link\":\"https://stackoverflow.com/users/2882213/%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e\",\"profile_image\":\"https://graph.facebook.com/1516449070/picture?type=large\",\"display_name\":\"ﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞ\"},{\"badge_counts\":{\"bronze\":35,\"silver\":18,\"gold\":3},\"account_id\":4337810,\"is_employee\":false,\"last_modified_date\":1611923441,\"last_access_date\":1650117757,\"reputation_change_year\":120,\"reputation_change_quarter\":40,\"reputation_change_month\":40,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":2821,\"creation_date\":1397662172,\"user_type\":\"registered\",\"user_id\":3541881,\"accept_rate\":100,\"location\":\"Echo Park, Burbank\",\"website_url\":\"https://sjain.dev\",\"link\":\"https://stackoverflow.com/users/3541881/%e1%94%95%e1%96%ba%e1%98%8e%e1%95%8a\",\"profile_image\":\"https://i.stack.imgur.com/bBmQb.png?s=256&g=1\",\"display_name\":\"ᔕᖺᘎᕊ\"},{\"badge_counts\":{\"bronze\":0,\"silver\":0,\"gold\":0},\"account_id\":4732854,\"is_employee\":false,\"last_access_date\":1406168529,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":1,\"creation_date\":1405053711,\"user_type\":\"registered\",\"user_id\":3827965,\"link\":\"https://stackoverflow.com/users/3827965/%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e-%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e\",\"profile_image\":\"https://www.gravatar.com/avatar/?s=256&d=identicon&r=PG&f=1\",\"display_name\":\"ﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞ ﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞ\"},{\"badge_counts\":{\"bronze\":12,\"silver\":2,\"gold\":1},\"account_id\":4897651,\"is_employee\":false,\"last_modified_date\":1632529800,\"last_access_date\":1410514753,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":77,\"creation_date\":1408177062,\"user_type\":\"registered\",\"user_id\":3946701,\"accept_rate\":50,\"website_url\":\"http://sammywaseem123\",\"link\":\"https://stackoverflow.com/users/3946701/%e1%8f%95%e1%8f%97%e1%8e%b7%e1%8e%b7%e1%8e%a9-%e1%8f%87%e1%8f%97%e1%8f%95%e1%8f%8b%e1%8f%8b%e1%8e%b7\",\"profile_image\":\"https://graph.facebook.com/100001273753236/picture?type=large\",\"display_name\":\"ᏕᏗᎷᎷᎩ ᏇᏗᏕᏋᏋᎷ\"},{\"badge_counts\":{\"bronze\":0,\"silver\":0,\"gold\":0},\"account_id\":5074304,\"is_employee\":false,\"last_access_date\":1431219531,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":1,\"creation_date\":1411505350,\"user_type\":\"registered\",\"user_id\":4072176,\"link\":\"https://stackoverflow.com/users/4072176/%e1%88%98%e1%89%a5%e1%88%ab%e1%89%b1-%e1%8d%80%e1%88%90%e1%8b%a9\",\"profile_image\":\"https://graph.facebook.com/1096781657/picture?type=large\",\"display_name\":\"መብራቱ ፀሐዩ\"},{\"badge_counts\":{\"bronze\":0,\"silver\":0,\"gold\":0},\"account_id\":5124220,\"is_employee\":false,\"last_access_date\":1412362175,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":1,\"creation_date\":1412362175,\"user_type\":\"registered\",\"user_id\":4106901,\"link\":\"https://stackoverflow.com/users/4106901/%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e-%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e%ef%b1%9e\",\"profile_image\":\"https://graph.facebook.com/100006509148476/picture?type=large\",\"display_name\":\"ﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞﱞ ﱞﱞﱞﱞﱞ\"},{\"badge_counts\":{\"bronze\":5,\"silver\":0,\"gold\":0},\"account_id\":5129802,\"is_employee\":false,\"last_modified_date\":1573680051,\"last_access_date\":1418695359,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":23,\"creation_date\":1412510311,\"user_type\":\"registered\",\"user_id\":4110422,\"accept_rate\":50,\"link\":\"https://stackoverflow.com/users/4110422/%ef%b1%9e%ef%b1%9e%ef%b1%9e-%ef%b1%9e%ef%b1%9e%ef%b1%9e\",\"profile_image\":\"https://graph.facebook.com/100006980591906/picture?type=large\",\"display_name\":\"ﱞﱞﱞ ﱞﱞﱞ\"},{\"badge_counts\":{\"bronze\":0,\"silver\":0,\"gold\":0},\"account_id\":5269276,\"is_employee\":false,\"last_modified_date\":1415761384,\"last_access_date\":1414974273,\"reputation_change_year\":0,\"reputation_change_quarter\":0,\"reputation_change_month\":0,\"reputation_change_week\":0,\"reputation_change_day\":0,\"reputation\":1,\"creation_date\":1414953515,\"user_type\":\"registered\",\"user_id\":4208097,\"link\":\"https://stackoverflow.com/users/4208097/%e1%8e%a5%e1%8f%b0%e1%8f%92%e1%8f%97%e1%8f%82%e1%8e%a5%e1%8e%b7-%e1%8f%a6%e1%8f%82%e1%8f%97%e1%8f%9d%e1%8e%a5%e1%8e%b4-%e1%8f%97%e1%8f%82%e1%8e%b7%e1%8f%8b%e1%8e%b4\",\"profile_image\":\"https://graph.facebook.com/100001503716204/picture?type=large\",\"display_name\":\"ᎥᏰᏒᏗᏂᎥᎷ ᏦᏂᏗᏝᎥᎴ ᏗᏂᎷᏋᎴ\"}],\"has_more\":true,\"quota_max\":300,\"quota_remaining\":262}"
    val gson= Gson()
    return gson.fromJson(OUTPUT_STRING, UsersList::class.java)
}
const val ARG_USERITEM = "useritem"
val displaydatetimeformat = SimpleDateFormat("dd-MMM-yy HH:mm",Locale.UK);

fun getDisplayDate(date: Long):String{
    val dt=Date(date*1000)
    return displaydatetimeformat.format(dt)
}

fun Long.getDateTime():String{
    val date=Date(this*1000)
    return displaydatetimeformat.format(date)
}

fun showErrorMsg(parent:View,msg:String){
    val snack: Snackbar = Snackbar.make(
        parent,msg, Snackbar.LENGTH_LONG
    )
    snack.show()
}

fun ImageView.loadImagefromUrl(imgurl:String){
    Picasso.get().load(imgurl).into(this);
}

fun getTimeDiff(startDate:Long):String{
    val startCalendar: Calendar = GregorianCalendar()
    startCalendar.timeInMillis=startDate*1000
    val endCalendar: Calendar = GregorianCalendar()
    endCalendar.timeInMillis=Calendar.getInstance().timeInMillis

    val diffYear: Int = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR)
    val diffMonth: Int = endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH)
    val diffDay: Int =
        endCalendar.get(Calendar.DAY_OF_MONTH) - startCalendar.get(Calendar.DAY_OF_MONTH)

    var result= "Member for "
    if(diffYear>0){
        result+="$diffYear Years "
    }
    if(diffMonth>0){
        result+="$diffMonth Months "
    }
    if(diffDay>0){
        result+="$diffDay Days"
    }
    return result;
}