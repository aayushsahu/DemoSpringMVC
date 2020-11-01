function updateTime(){
	var today = new Date();
	var date = today.getFullYear()+'-'+(today.getMonth()+1)+'-'+today.getDate();
	var hrs=today.getHours();
	var mins=today.getMinutes();
	var secs=today.getSeconds();
	var hours="";
	var minutes="";
	var seconds="";
	if(hrs%10==hrs)
		hours="0"+hrs;
	else 
		hours=hrs;
	if(mins%10==mins)
		minutes="0"+mins;
	else 
		minutes=mins;
	if(secs%10==secs)
		seconds="0"+secs;
	else 
		seconds=secs;
	
	var time = hours + ":" + minutes + ":" + seconds;
	//console.log(hrs+":"+mins+":"+secs)
	var dateTime = date+' '+time;
    $('#mytime').html(time);
}
		
$(function() {
    updateTime();
    setInterval(updateTime, 1000);
});

function showRepeat(t){
	if(document.getElementById('repeatCheckbox').checked){
		document.getElementById('onrepeat').classList.remove('invisible');
		//console.log("checked and visible");
	}
	else{
		document.getElementById('onrepeat').classList.add('invisible');
		//console.log("unchecked and invisible");
		
	}
}

function validateAlarm(t){
	var time=document.getElementById('alarm-timing').value;
	console.log(time)
	if(time==""){
		document.getElementById('errtime').classList.remove('invisible');
		//console.log("error msg displayed");
	}
	else{
		document.getElementById('errtime').classList.add('invisible');
		//console.log("error msg hdden");
	}
}