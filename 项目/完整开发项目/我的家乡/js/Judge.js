function isUsername(str){
	var re = /^[a-zA-z][a-zA-Z0-9_]{3,15}$/;
	return re.test(str);
}  

function isEmail(str){
	var re = /^\w+([-+.]\w+)*@\w+([-.]\w)*\.\w+([-.]\w+)*$/;
	return re.test(str);
}

function isPassword(str){
	var re = /^[a-zA-Z]\w{5,23}$/;
	return re.test(str);
}


function isPnumber(str){
	var re = /^1[34578]\d{9}$/;
	return re.test(str);
}