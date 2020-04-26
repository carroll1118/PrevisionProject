function hasClass(elem, cls) {
    cls = cls || '';
    if (cls.replace(/\s/g, '').length == 0) return false;
    return new RegExp(' ' + cls + ' ').test(' ' + elem.className + ' ');
}

function addClass(elem, cls) {
    if (!hasClass(elem, cls)) {
        elem.className = elem.className == '' ? cls : elem.className + ' ' + cls;
    }
}

function removeClass(elem, cls) {
    for (var i = 0; i < elem.length; i++) {
        if (hasClass(elem[i], cls)) {
            var newClass = ' ' + elem[i].className.replace(/[\t\r\n]/g, '') + ' ';
            while (newClass.indexOf(' ' + cls + ' ') >= 0) {
                newClass = newClass.replace(' ' + cls + ' ', ' ');
            }
            elem[i].className = newClass.replace(/^\s+|\s+$/g, '');
        }
    }
}
// 登录框显示
function login() {
    document.getElementById("loginMock").style.display = 'block';
}
// 登录框隐藏
function closeLogin() {
    document.getElementById("loginMock").style.display = 'none';
};

// 视频弹框隐藏
function videoClose() {
    document.getElementById("videoMock").style.display = 'none';
};



window.onload = function () {
    // 电视剧榜单
    var listContent = document.getElementById("listContent").getElementsByTagName("a");
    for (var i = 0; i < listContent.length; i++) {
        listContent[i].addEventListener("mouseover", function () {
            removeClass(listContent, "cur")
            addClass(this, "cur")
        })
    }
    // 新剧前瞻
    var banner = document.getElementById("banner").getElementsByTagName("li");
    for (var i = 0; i < banner.length; i++) {
        banner[i].addEventListener("mouseover", function () {
            removeClass(banner, "cur")
            addClass(this, "cur")
        })
    }

    // 海外剧日历
    var overseas = document.getElementById("overseas").getElementsByTagName("a");
    for (var i = 0; i < overseas.length; i++) {
        overseas[i].addEventListener("mouseover", function () {
            removeClass(overseas, "cur")
            addClass(this, "cur")
        })
    }
    
    var videoWindow = document.getElementById("videoWindow");
    if(videoWindow.src.indexOf(".mp4")>0){
    	document.getElementById("videoMock").style.display = 'block';
    }else{
    	document.getElementById("videoMock").style.display = 'none';
    }

    // 视频弹窗显示
    var play = document.getElementsByClassName('play');
    for (var i = 0; i < play.length; i++) {
        play[i].addEventListener("click", function () {
            document.getElementById("videoMock").style.display = 'block';
        })
    }

}
