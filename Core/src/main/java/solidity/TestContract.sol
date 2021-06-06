pragma solidity ^0.8.0;

contract TestContract {

    uint ballance;

    function sendToCompany(address amount, uint amount) public {
        require(ballance > amount);

    }
}
