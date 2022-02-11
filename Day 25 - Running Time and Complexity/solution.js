function processData(input) {
    //Enter your code here
    var arr = input.split('\n');
    for (var i = 1; i < arr.length; i++){
        var n = arr[i];
        if (isPrime(n)){
            console.log("Prime");
        }else {
            console.log("Not prime");
        }
    }
} 

function isPrime(n){
    if (n <= 1){
        return false;
    }
    if (n <= 3){
        return true;
    }

    if (n % 2 == 0 || n % 3 == 0){
        return false;
    }

    return true;
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
