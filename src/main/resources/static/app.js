
var ws;

<<<<<<< HEAD
=======

>>>>>>> 640004ec20beb6361ff54c41395f9291c708981d
function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
    }
    else {
        $("#conversation").hide();
    }
    $("#greetings").html("");
}

function connect() {
	ws = new WebSocket('ws://localhost:8080/name');
	ws.onmessage = function(data){
		showGreeting(data.data);
	}
	 setConnected(true);
}

function disconnect() {
    if (ws != null) {
        ws.close();
    }
    setConnected(false);
    console.log("Disconnected");
}

function sendName() {
<<<<<<< HEAD
	var data = JSON.stringify({'myDevice': $("#myDevice").val()})
    ws.send(data);
}


function showGreeting(message) {
    	
    $("#greetings").append("<tr class='sendMsg'><td> " + message + "</td></tr>");
    showModal();
    	
    };
    
    
function showModal() {    
	
	console.log("start showModal.............");
	
	 	if($('.sendMsg').length > 0) {
	 		
	 	$('#myModal').modal('show');
		
		var tempMsg = "";
		
		 if(!('webkitSpeechRecognition' in window)) $('#myModal').html('<strong>지원하지 않는 브라우저입니다.</strong>');
		 
		  else{
		    var mic = new webkitSpeechRecognition();
		    mic.continuous = true;
		    mic.interimResults = true;
		    mic.lang = 'ko-KR';
		    
		    mic.onresult = function(e) {
		      var b = '', c = false;
		      for(var i = e.resultIndex; i < e.results.length; ++i) {
		        b += e.results[i][0].transcript;
		        c = e.results[i].isFinal;
		      }
		      if($('#speech_box .text').length < 1) $('#speech_box').append('<span class="text"></span>');
		      $('#speech_box .text').text(b);
		      if(c) $('#speech_box .text').removeClass('text');
		      
		      tempMsg = b;
		       
		    };
				 
		    
    	    <!--마이크 end 일 때-->
    	    mic.onend = function() {
    	    	
    	    console.log(tempMsg);
  
    	  	mic.stop();
    	    $('.modal-body').removeClass('on');

    	      
    	    };
    	    
		    
		    <!--마이크 on 일 때-->
		    $(".modal-body").show(function () {
		      if($('.modal-body').hasClass('on')) mic.stop();
		      else {
		        mic.start();
		        console.log("mic start.............")
		        
		      $('.modal-body').toggleClass('on');
		      window.setTimeout(function () {
		    	  	mic.stop();
			        $("#myModal").modal("hide");
			        
			        console.log(tempMsg);

			      $('.modal-body').removeClass('on');
			    },5000);
		      <!-- close else -->
		      }
		     
		    <!-- close function -->
		    });
		      
		      
		  <!-- close else -->
		  }
		 
		}
		 
};
=======
	var data = JSON.stringify({'name': $("#name").val()})
    ws.send(data);
}

function showGreeting(message) {
    $("#greetings").append("<tr><td> " + message + "</td></tr>");
}
>>>>>>> 640004ec20beb6361ff54c41395f9291c708981d

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#connect" ).click(function() { connect(); });
    $( "#disconnect" ).click(function() { disconnect(); });
    $( "#send" ).click(function() { sendName(); });
<<<<<<< HEAD
});
=======
});

>>>>>>> 640004ec20beb6361ff54c41395f9291c708981d
