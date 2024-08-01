let accounts = [];

$(document).ready(function () {
    $('#accountForm').on('submit', function (e) {
        e.preventDefault();
        
        let accountId = $('#accountId').val().trim();
        let accountName = $('#accountName').val().trim();
        let accountType = $('#accountType').val();
        let balance = parseFloat($('#balance').val().trim());
        let creationDate = $('#creationDate').val().trim();
        
        if (accountId === '' || accountName === '' || accountType === '' || isNaN(balance) || balance < 5000 || creationDate === '') {
            alert('Please fill all fields correctly.');
            return;
        }
        
        let account = {
            accountId: accountId,
            accountName: accountName,
            accountType: accountType,
            balance: balance,
            creationDate: creationDate
        };
        
        accounts.push(account);
        alert('Account information saved successfully!');
        this.reset();
    });

    $('#showInfo').on('click', function () {
        console.log(accounts);
        alert('Check the console for account details.');
    });
});
