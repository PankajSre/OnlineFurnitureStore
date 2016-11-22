<%@ include file="header.jsp"%>
<section>
   <div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
     
    </ol>

    <!-- Wrapper for slides -->
    
 

    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="resources/images/music1.jpg" alt="Music Instrument" width="460" height="345">
      </div>

      <div class="item">
        <img src="resources/images/music2.jpg" alt="Music Instrument" width="460" height="345">
      </div>
    
      <div class="item">
        <img src="resources/images/music3.jpg" alt="Music Instrument" width="460" height="345">
      </div>
        <div class="item">
        <img src="resources/images/products/second.jpg" alt="Music Instrument" width="460" height="345">
      </div>
        <div class="item">
        <img src="resources/images/products/third.jpg" alt="Music Instrument" width="460" height="345">
      </div>

      

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="false"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="false"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</div>
</section>
  <!--/#main-slider-->
<section>
	<%@ include file="displayProducts.jsp"%>
</section>
<%@ include file="footer.jsp"%>