function processData(input) {
    //Enter your code here
    input = input.split('\n');
    var phoneBook = [];
  
    for (i = 1; i <= parseInt(input[0]); i++) {
      var contactArray = input[i].split(' ');
      phoneBook[contactArray[0]] = contactArray[1];
    }
  
    for (i = (parseInt(input[0]) + 1); i < input.length; i++) {
      if (phoneBook[input[i]]) {
        console.log(input[i] + '=' + phoneBook[input[i]]);
      } else {
        console.log('Not found');
      }
    }
  }
  
  process.stdin.resume();
  process.stdin.setEncoding("ascii");
  _input = "";
  process.stdin.on("data", function (input) {
      _input += input;
  });
  
  process.stdin.on("end", function () {
     processData(_input);
  });
  