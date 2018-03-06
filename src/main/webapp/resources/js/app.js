$('.banner').slick({
	dots: true,
	arrows: false
});
$(window).stellar();

$(".product-content").mouseenter(function(){
	$(this).find('i.fa-shopping-cart').addClass('animated rollIn');
});
$(".product-content").mouseleave(function(){
	$(this).find('i.fa-shopping-cart').removeClass('animated rollIn');
});