const userScore = 0;
const compScore = 0;
const userScore_span = document.getElementById("user-score");
const compScore_span = document.getElementById("Computer-Score");
const scoreBoard_div = document.querySelector(".score-board");
const result_div = document.querySelector(".result");
const rock_div = document.getElementById("r");
const paper_div = document.getElementById("p");
const scissor_div = document.getElementById("s");

function getComputerChoice(){
    const choices = ['r','p','s'];
    const randomNumber = Math.floor(Math.random() * 3);
    return choices[randomNumber];
}
function win(userScore, compScore){
    userScore++;
    userScore_span.innerHTML=userScore;
    compScore_span.innerHTML=compScore;

}
function lose(){

}
function draw(){

}

function game(userChoice) {
    const computerChoice = getComputerChoice();
    switch (userChoice+computerChoice){
        case "rs":
        case "sp":
        case "pr":
            win();
            break;
        case "rs":
        case "sp":
        case "pr":
            lose();
            break;
        case "rr":
        case "ss":
        case "pp":
            draw();
            break;
    }

}

rock_div.addEventListener('click', function() {
    game("r");
})
paper_div.addEventListener('click', function() {
    game("p");
})
scissor_div.addEventListener('click', function() {
    game("s");
})

// main();