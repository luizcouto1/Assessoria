$(document).ready(function(){
$('.button-collapse').sideNav({
    menuWidth: 300, 
    edge: 'right', 
    closeOnClick: true,
    draggable: true, 
    onOpen: function(el) { / Do Stuf / }, 
    onClose: function(el) { / Do Stuff / }, 
  }
);
});