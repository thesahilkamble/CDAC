import './ExpenseItem.css'

let ExpenseItem = () => {
    
    let expDate = new Date()
    let expTitle = "Laptop"
    let expAmount = 90000


    return (
        <div className="expense-item">
            <div>{expDate.toISOString()}</div>
            <div className="expense-item__description">
                <h2>{expTitle}</h2>
                <p className="expense-item__price">Rs {expAmount}</p>
            </div>
        </div>

    )
}

export default ExpenseItem