var numbers = ['One','Two','Three','Four' , 'Five','Six','Seven','Eight','Nine','Ten'];

var addedPlatforms = [];
$(document).ready(function() { 
	
	
	$("#addMoreFeePlanBtn").click(function(){
		$('#show').hide();
		var index = $('.accordion-group').length;
		addAmountSlab(index);
		callAccordion();
		
		if(index != 0){
			var selectObject = document.getElementById('platformID'+index);
			for(var platform=0; platform<addedPlatforms.length; platform++){
				var id = addedPlatforms[platform];
				for(var selectedPlatform=0; selectedPlatform<selectObject.length; selectedPlatform++){
					if(selectObject.options[selectedPlatform].value == id)
						selectObject.remove(selectedPlatform);
				}
			}
		}
		
		//can add events on newly appended html elements here
		
		$('#platformID'+index).change(function(){
			$('#accordion'+index).text($(this).children('option:selected').text());
			addedPlatforms.push($(this).val());
			
		});	
	});
	
	$("#addFeePlanBtn").click(function(){
		var accordian = $('.accordion-group').length;
		if(validateForm()){
			if(accordian == 0){
				$('#show').html("Please add atleast one fee plan");
			}else{
				slabString();
				platformCommissionString();
				$("#addFeeForm").submit();
			}
		}else{
			$('#show').html("Please add atleast one fee plan");
			return false;
		}
	});

});

function isValidFee(fromVal,evt){
	evt = (evt) ? evt : window.event;
	var charcode = (evt.which) ? evt.which :evt.keyCode;
	var val = fromVal.value;
	//alert("Inside decimal fee "+val+" charcode "+charcode+ " index of "+val.indexOf('.'));
	
	var rgxIntegralPart = /^[0-9]{0,9}$/;
	var rgxFractionalPart = /^.?[0-9]{0,1}$/;
	var index = val.indexOf('.');
	
	if(!isDecimal(evt)){
		return false;
	}else if(charcode == 46){	// For decimal point
		if(val=="" || index!= -1){
			return false;
		}
	}else if(!(charcode == 8 || charcode ==9)){	// Ignore back space and Tab key
		if(index== -1)
			return rgxIntegralPart.test(val);
		else{
			return rgxFractionalPart.test(val.substring(index));
		}
	}
	
	return true;
}




function addAmountSlab(platformIndex){
	
	var slabIndex = 0;
	var contents = '<div id="accordion-group'+platformIndex+'" class="accordion-group"> '+
				'<h6 id="accordion'+platformIndex+'" class="accordion"> Platform '+numbers[platformIndex]+'</h6>'+
				'<div class="spanel" id="spanel'+platformIndex+'">'+
					'<div class="form-group">'+
						'<label class="title">Platform <b>*</b></label>'+
						'<select name="platformIds" class="custom-select platform" id="platformID'+platformIndex+'"></select>'+
						'<span class="error" id="platformID'+platformIndex+'Error"></span>'+
					'</div>'+
					'<div class="form-group">'+
						'<label class="title">Commission Type <b>*</b></label>'+
						'<select name="commissionTypes" class="custom-select commission" id="commissionType'+platformIndex+'"></select>'+
						'<span class="error" id="commissionType'+platformIndex+'Error"></span>'+
					'</div>'+
					'<table class="tableNBdr">'+
					'<tr>'+
						'<th>'+
							'From Value'+
						'</th>'+
						'<th>'+
							'To Value'+
						'</th>'+
						'<th class="flatCl'+platformIndex+''+slabIndex+'">'+
							'Non QR-Commission Amt'+
						'</th>'+
						'<th class="perCl'+platformIndex+''+slabIndex+'">'+
							'Non QR-Commission Rate'+
						'</th>'+
						'<th class="QRflatCl'+platformIndex+''+slabIndex+'">'+
							'QR-Commission Amt'+
						'</th>'+
						'<th class="QRperCl'+platformIndex+''+slabIndex+'">'+
							'QR-Commission Rate'+
						'</th>'+
						'<th>'+
							'Tax'+
						'</th>'+
					'</tr>'+
					'<tbody>';
					
					var required = '*';
					for(slabIndex ;slabIndex<3;slabIndex++ ){
						
						if(slabIndex != 0){
							required ='';
						}
						
						contents = contents+
						'<tr>'+
						'<td>'+
							'<span class="asterik">'+required+'</span>'+
							'<input type="text" name="fromVal['+platformIndex+']" id="fromVal'+platformIndex+''+slabIndex+'" class="form-control m1" onkeypress="return isValidFee(this,event)" style="width:100%" />'+
							'<span class="nerror" id="fromVal'+platformIndex+''+slabIndex+'Error"></span>'+
						'</td>'+
						'<td>'+
							'<span class="asterik">'+required+'</span>'+
							'<input type="text" name="toVal['+platformIndex+']" id="toVal'+platformIndex+''+slabIndex+'" class="form-control m1" onkeypress="return isValidFee(this,event)" style="width:100%" />'+
							'<span class="nerror" id="toVal'+platformIndex+''+slabIndex+'Error"></span>'+	
						'</td>'+
						'<td class="flatCl'+platformIndex+''+slabIndex+'">'+
							'<span class="asterik">'+required+'</span>'+
							'<input type="text" name="flatFeeVal['+platformIndex+']" id="flatFeeVal'+platformIndex+''+slabIndex+'" class="form-control m1" onkeypress="return isValidFee(this,event)" style="width:100%" />'+
							'<span class="nerror" id="flatFeeVal'+platformIndex+''+slabIndex+'Error"></span>'+
						'</td>'+
						'<td class="perCl'+platformIndex+''+slabIndex+'">'+
							'<span class="asterik">'+required+'</span>'+
							'<input type="text" name="PercFeeVal['+platformIndex+']" id="PercFeeVal'+platformIndex+''+slabIndex+'" class="form-control m1" onkeypress="return isValidFee(this,event)" style="width:100%" />'+
							'<span class="nerror" id="PercFeeVal'+platformIndex+''+slabIndex+'Error"></span>'+	
						'</td>'+
						'<td class="QRflatCl'+platformIndex+''+slabIndex+'">'+
							'<span class="asterik">'+required+'</span>'+
							'<input type="text" name="QRflatFeeVal['+platformIndex+']" id="QRflatFeeVal'+platformIndex+''+slabIndex+'" class="form-control m1" onkeypress="return isValidFee(this,event)" style="width:100%" />'+
							'<span class="nerror" id="QRflatFeeVal'+platformIndex+''+slabIndex+'Error"></span>'+	
						'</td>'+
						'<td class="QRperCl'+platformIndex+''+slabIndex+'">'+
							'<span class="asterik">'+required+'</span>'+
							'<input type="text" name="QRPercFeeVal['+platformIndex+']" id="QRPercFeeVal'+platformIndex+''+slabIndex+'" class="form-control m1" onkeypress="return isValidFee(this,event)" style="width:100%" />'+
							'<span class="nerror" id="QRPercFeeVal'+platformIndex+''+slabIndex+'Error"></span>'+	
						'</td>'+
						'<td>'+
							'<span class="asterik">'+required+'</span>'+
							'<input type="text" name="taxVal['+platformIndex+']" id="taxVal'+platformIndex+''+slabIndex+'" class="form-control m1" onkeypress="return isValidFee(this,event)" style="width:100%" />'+
							'<span class="nerror" id="taxVal'+platformIndex+''+slabIndex+'Error"></span>'+
						'</td>'+
						'</tr>';
					}
				contents=contents+'</tbody>'+
				'</table>'+'</div>'+
				'</div>';
				
	$('#parentFeeSlab').append(contents);
	//filter(function(index , element){   for(var i = 0 ; i< addedPlatforms.length;i++ ){ if($(element).val()==addedPlatforms[i])return false; else return element;}}).
	
	$('#hidPlatformMaster option').clone().appendTo('#platformID'+platformIndex);
	$('#hidCommissionTypeMaster option').clone().appendTo('#commissionType'+platformIndex);
	
	$('#commissionType'+platformIndex).change(function () {
		var utype = $('select#commissionType'+platformIndex).val();
		if(utype == "1")
		{
			$('[class^="flatCl'+platformIndex+'"]').hide();
			$('[class^="QRflatCl'+platformIndex+'"]').hide();
			$('[class^="perCl'+platformIndex+'"]').show();
			$('[class^="QRperCl'+platformIndex+'"]').show();
		}else if(utype == "2")
		{
			$('[class^="flatCl'+platformIndex+'"]').show();
			$('[class^="QRflatCl'+platformIndex+'"]').show();
			$('[class^="perCl'+platformIndex+'"]').hide();
			$('[class^="QRperCl'+platformIndex+'"]').hide();
		}else{
			$('[class^="flatCl'+platformIndex+'"]').show();
			$('[class^="QRflatCl'+platformIndex+'"]').show();
			$('[class^="perCl'+platformIndex+'"]').show();
			$('[class^="QRperCl'+platformIndex+'"]').show();
		}
		
	});

}

function callAccordion() {
	
	var acc = document.getElementsByClassName("accordion");
	var i;
	
	for (i = 0; i < acc.length; i++) {
		acc[i].onclick = function() {
			this.classList.toggle("active");
			var panel = this.nextElementSibling;
			if (panel.style.maxHeight){
				panel.style.maxHeight = null;
			} else {
				panel.style.maxHeight = panel.scrollHeight + "px";
			} 
 		}
	}
}



function validateDropDowns(idpr) {
	var flag = false;
	if($('#'+idpr)[0].selectedIndex ==0){
		$("#"+idpr+"Error").text("Please select at least one value");
	}else{
		$("#"+idpr+"Error").text("");
		flag = true;
	}
	return flag;
}

function validateEveryThing(id,type,minLength,isMinLngthReq){
	var val = $("#"+id).val().trim();
	var rgxN = /^[0-9]+$/;
	var rgxAL = /^[a-zA-Z]+$/;
	var rgxALN = /^[a-zA-Z0-9]+$/;
	var regexFloat = /^((\.\d+)|(\d+(\.\d+)?))$/;
	var rgxALS = /^[a-zA-Z0-9\s]+$/;
	var regexEmail = /^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
	/*var regDate = /^([0-9]{2})\/([0-9]{2})\/([0-9]{2})/;*/
	var flag = false;

	if(val ==""){
		$("#"+id+"Error").text("Required");
	}else if(isMinLngthReq && val.length < minLength){
		$("#"+id+"Error").text("Minimum length should be "+minLength);
	}else if(type=="NUMBER" && val !="" && !rgxN.test(val)){
		$("#"+id+"Error").text("Please enter only numbers");
	}else if(type=="ALPHANUM" && val !="" && !rgxALN.test(val)){
		$("#"+id+"Error").text("Please enter only numbers and alphabets");
	}else if(type=="ALPHABETS" && val !="" && !rgxAL.test(val)){
		$("#"+id+"Error").text("Please enter only alphabets");
	}else if(type=="FLOAT" && val !="" && (val<=0.0 || !regexFloat.test(val))){
		$("#"+id+"Error").text("Please enter valid rate");
	}else if(type=="ALPHANUMSPACE" && val !="" && !rgxALS.test(val)){
		$("#"+id+"Error").text("Please enter only numbers and alphabets");
	}else if(type=="EMAIL" && val !="" && !regexEmail.test(val)) {
		$("#"+id+"Error").text("Not a valid e-mail address");		        
	}/*else if(type=="DATE" && val !="" && !regDate.test(val)) {
		$("#"+id+"Error").text("Invalid date format");		        
		flag = false;			
	}*/else if(type =="PERCENT" && val !="" && (val<=0.0 || val>=100.01 || !regexFloat.test(val))){
		$("#"+id+"Error").text("Please enter valid rate");
	}
	else{
		$("#"+id+"Error").text("");
		flag = true;
	}
	return flag;
}

function platformCommissionString(){
	var platformNumber = $('.accordion-group').length;
	var newPlatform = "";
	var commisionSlab ="";
	
	for(var index=0;index<platformNumber; index++){
		var platformId = $('#platformID'+index).val();
		var commissionId = $('#commissionType'+index).val();
		
		commisionSlab = platformId+'~'+commissionId;
		newPlatform = newPlatform+commisionSlab+'|'
	}
	$("#commission").val(newPlatform);
}


function slabString(){
	
	var totalPlatforms = $('.accordion-group').length;
	var slabplatform = "";
	
	
	for(var mainIndex=0;mainIndex<totalPlatforms;mainIndex++){
		var platformid = $('#platformID'+mainIndex).val();
		var platformSlab = "";
		
		var slabCount = $('input[id^="fromVal'+mainIndex+'"]').length;
		
		for(var slabIndex = 0;slabIndex<slabCount;slabIndex++){
			var fromAmountFieldId = 'fromVal'+mainIndex+''+slabIndex;
			var toAmountFieldId = 'toVal'+mainIndex+''+slabIndex;
			var flatfeeId = 'flatFeeVal'+mainIndex+''+slabIndex;
			var qrflatfeeId = 'QRflatFeeVal'+mainIndex+''+slabIndex;
			var percfeeId = 'PercFeeVal'+mainIndex+''+slabIndex;
			var qrpercfeeId = 'QRPercFeeVal'+mainIndex+''+slabIndex;
			var taxAmountField = 'taxVal'+mainIndex+''+slabIndex;
			
			var from = $('#'+fromAmountFieldId).val();
			var to = $('#'+toAmountFieldId).val();
			var flat = $('#'+flatfeeId).val();
			var qrflat = $('#'+qrflatfeeId).val();
			var perc = $('#'+percfeeId).val();
			var qrperc = $('#'+qrpercfeeId).val();
			var tax = $('#'+taxAmountField).val();
			
			if(from != "" && to != "" && tax != "" && (flat != "" || perc != "") && (qrflat != "" || qrperc != "")){
				platformSlab = platformSlab+platformid+',';
				if(flat == "" && qrflat == ""){
					flat = "0";
					qrflat = "0";
				}else if(perc == "" && qrperc == ""){
					perc = "0";
					qrperc = "0"
				}
				platformSlab = platformSlab+from+','+to+','+flat+','+perc+','+qrflat+','+qrperc+','+tax+'|';
			}
		}
		slabplatform = slabplatform+platformSlab;
	}
	$("#slab").val(slabplatform);
}

function validateForm(){
	$('.error').children('span').text(''); // to remove comments every time user submit
	var formFlag = true ;
	
	
	//first find total rows/platforms added (main section)
	var totalPlatforms = $('.accordion-group').length;
	
	for(var mainIndex=0;mainIndex<totalPlatforms;mainIndex++){
		
		var fieldIdPlatform = 'platformID'+mainIndex;
		var fieldIdCommissionType = 'commissionType'+mainIndex;
		var panelId = 'spanel'+mainIndex;
		
		
		if(!validateDropDowns(fieldIdPlatform)){
			formFlag = false ;
		}
		if(!validateDropDowns(fieldIdCommissionType)){
			formFlag = false ;
		}
		//find number of fields added in slab for each platform
		//this jquery expression will find the input firn with prefix fromVal+[indexOfPlatform]
		var slabCount = $('input[id^="fromVal'+mainIndex+'"]').length;
		
		
		
		for(var slabIndex = 0;slabIndex<slabCount;slabIndex++){
			
			var fromAmountFieldId = 'fromVal'+mainIndex+''+slabIndex;
			var toAmountFieldId = 'toVal'+mainIndex+''+slabIndex;
			var flatfeeId = 'flatFeeVal'+mainIndex+''+slabIndex;
			var qrflatfeeId = 'QRflatFeeVal'+mainIndex+''+slabIndex;
			var percfeeId = 'PercFeeVal'+mainIndex+''+slabIndex;
			var qrpercfeeId = 'QRPercFeeVal'+mainIndex+''+slabIndex;
			var taxAmountField = 'taxVal'+mainIndex+''+slabIndex;
			var utype = $('select#'+fieldIdCommissionType).val();
			//to make first row mandatory
			if(slabIndex==0){
				if(!validateEveryThing(fromAmountFieldId, "FLOAT", 0, false)){
					formFlag = false ;
				}
				if(!validateEveryThing(toAmountFieldId, "FLOAT", 0, false)){
					formFlag = false ;
				}
				if(!validateEveryThing(taxAmountField, "FLOAT", 0, false)){
					formFlag = false ;
				}
				
				var fromValue = $('#'+fromAmountFieldId).val();
				var toValue = $('#'+toAmountFieldId).val();
				
					if(fromValue != "" && toValue != ""){
						if(toValue < parseFloat (fromValue)){
							$('#'+'fromVal'+mainIndex+''+slabIndex+'Error').text("From Value should be less than to Value");
							formFlag = false;
						}
					}
					
				
				// to make from val and to val mandatory based on commission type
				if(utype == "3")
				{
					if(!validateEveryThing(flatfeeId,"FLOAT",1,false)){
						formFlag = false ;
					}
					if(!validateEveryThing(qrflatfeeId,"FLOAT",1,false)){
						formFlag = false ;
					}
					if(!validateEveryThing(percfeeId,"PERCENT",1,false)){
						formFlag = false ;
					}
					if(!validateEveryThing(qrpercfeeId,"PERCENT",1,false)){
						formFlag = false ;
					}
				}
				if(utype == "1")
				{
					if(!validateEveryThing(percfeeId,"PERCENT",1,false)){
						formFlag = false ;
					}
					if(!validateEveryThing(qrpercfeeId,"PERCENT",1,false)){
						formFlag = false ;
					}
				}
				if(utype == "2")
				{
					if(!validateEveryThing(flatfeeId,"FLOAT",1,false)){
						formFlag = false ;
					}
					if(!validateEveryThing(qrflatfeeId,"FLOAT",1,false)){
						formFlag = false ;
					}
				}
			}else{
				//from second row if any of the field contains value make all fields to be filled with value
				//need to check the value of all fields in one row
				
				var from = $('#'+fromAmountFieldId).val();
				if(from!=""){
					if(!validateEveryThing(fromAmountFieldId, "FLOAT", 0, false)){
						formFlag = false ;
					}
					if(!validateEveryThing(toAmountFieldId, "FLOAT", 0, false)){
						formFlag = false ;
					}
					if(!validateEveryThing(taxAmountField, "FLOAT", 0, false)){
						formFlag = false ;
					}
					
					var fromV = $('#'+fromAmountFieldId).val();
					var toV = $('#'+toAmountFieldId).val();
					
						if(fromV != "" && toV != ""){
							if(toV < parseFloat (fromV)){
								$('#'+'fromVal'+mainIndex+''+slabIndex+'Error').text("From Value should be less than to Value");
								formFlag = false;
							}
					}
				
				if(utype == "3")
				{
					if(!validateEveryThing(flatfeeId,"FLOAT",1,false)){
						formFlag = false ;
					}
					if(!validateEveryThing(qrflatfeeId,"FLOAT",1,false)){
						formFlag = false ;
					}
					if(!validateEveryThing(percfeeId,"PERCENT",1,false)){
						formFlag = false ;
					}
					if(!validateEveryThing(qrpercfeeId,"PERCENT",1,false)){
						formFlag = false ;
					}
				}
				if(utype == "1")
				{
					if(!validateEveryThing(percfeeId,"PERCENT",1,false)){
						formFlag = false ;
					}
					if(!validateEveryThing(qrpercfeeId,"PERCENT",1,false)){
						formFlag = false ;
					}
				}
				if(utype == "2")
				{
					if(!validateEveryThing(flatfeeId,"FLOAT",1,false)){
						formFlag = false ;
					}
					if(!validateEveryThing(qrflatfeeId,"FLOAT",1,false)){
						formFlag = false ;
					}
				}
				}
			}
		}
		if(!formFlag){
			document.getElementById(panelId).style.maxHeight = document.getElementById(panelId).scrollHeight + "px";
		}
	}
	if(!validateEveryThing("profileCode","ALPHANUM",3,true)){
		formFlag = false ;
	}
	if(!validateEveryThing("profileDesc","ALPHANUMSPACE",5,true)){
		formFlag = false ;
	}
	if(!validateEveryThing("fromDate","DATE",8,true)){
		formFlag = false ;
	}
	if(!validateEveryThing("toDate","DATE",8,true)){
		formFlag = false ;
	}
	
	var fromDate=new Date($("#fromDate").val());
	var toDate=new Date($("#toDate").val());
	if($("#fromDate").val()=='' && $("#toDate").val()!=''){
		$("#fromDateError").text("Please select from date ");
		formFlag = false;
	}
	else if($("#toDate").val()=='' && $("#fromDate").val()!=''){
		$("#toDateError").text("Please select to date ");
		formFlag = false;
	}
	else if (fromDate>toDate) {
		$("#fromDateError").text("From Date should be less than to date");
		formFlag = false;
	}
	return formFlag;
}