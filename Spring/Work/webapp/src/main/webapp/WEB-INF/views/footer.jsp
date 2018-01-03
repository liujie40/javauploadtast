<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<footer data-role="footer">
    <!-- 푸터 메냐 만들기 -->
    <div id="footer">
        <div class="foot_box">
            <ul>
                <li><a href="index.jsp">HOME</a></li>
                <li><a href="#">아이콘보기</a></li>
                <li class="end"><a href="#">전체보기</a></li>
            </ul>
            <input type="button" value="로그인">
            <input type="button" value="PC버전">
            <input type="button" value="고객센터">
            <p class="privacy">
                <a href="#">개인정보취급방침</a>
                <span class="bar">|</span>
                <a href="#" class="copyrights">이용약관</a>
            </p>
        </div>
    </div>

    <!-- 상단 바로가기 만들기 -->
    <div class="end_bar">
        <span class="copyrights helv">COPYRIGHT&copy; 2012. ALL RIGHTS RESERVED.</span>
        <a href="javascript:window.scrollTo(0,0);"><img src="../../resources/images/btn_bot_top.png"></a>
    </div>
</footer>