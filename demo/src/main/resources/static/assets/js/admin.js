$(document).ready(function(){
  $(".schoolList .editSchool").click(function(event){
    event.preventDefault();
    var href = $(this).attr('href');
    $.get(href, function(data, status){

         $('.modal-body  #id').val(data.id);
         $('.modal-body  #name').val(data.name);
         $('.modal-body  #speciality').val(data.speciality);
         $('.modal-body  #direction').val(data.direction);
         $('.modal-body  #diplomaWork').val(data.diplomaWork);
         $('.modal-body  #degree').val(data.degree);
         $('.modal-body  #startDate').val(data.startDate);
         $('.modal-body  #endDate').val(data.endDate);
    });
  });

//  $(".expList .editExp").click(function(event){
//    event.preventDefault();
//    var href = $(this).attr('href');
//    $.get(href, function(data, status){
//        $('.modal-body  #companyName').val(data.company);
//        $('.modal-body  #companyCity').val(data.city);
//        $('.modal-body  #companyPosition').val(data.position);
//        $('.modal-body  #startExp').val(data.startDate);
//        $('.modal-body  #endExp').val(data.startEnd);
//        });
//    });
});