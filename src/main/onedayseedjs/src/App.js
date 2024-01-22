import logo from './logo.svg';
import './App.css';
import React, { useEffect, useState } from 'react';
import axios from "axios";

function App() {

  const baseUrl = "http://localhost:8080/lesson/new";
  const [data, setData] = useState();

  useEffect(()=>{
    getData();
  },[]);

  async function getData(){
    await axios.get(baseUrl)
    .then((response)=>{
      console.log(response.data);
      setData(response.data);
    })
    .catch((error)=>{
      console.log(error);
    })
  }
  
  return (
    <div className="App">
      
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload. 형석
        </p>
        <input type='text' placeholder={data}></input>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}


export default App;
