import logo from './logo.svg';
import './App.css';
import ExpenseItem from './components/ExpenseItem';
import Person from './components/Person';
import MessageComponent from './components/MessageComponent';

function App() {
  return (
    <div className="App">
      <h1>Lets revise React</h1>
      <MessageComponent />
      <ExpenseItem />
      <ExpenseItem />
      <ExpenseItem />
      <Person name="Pranav" age="21"/>
      <Person name="Poonam" age="22"/>
      <Person name="Siddhant" age="24"/>
    </div>
  );
}

export default App;
