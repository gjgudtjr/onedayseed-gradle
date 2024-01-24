import './App.css';
import React, { useEffect, useState, Component } from 'react';
import axios from "axios";
import LessonForm from './components/LessonForm';
import { Route, Routes } from 'react-router-dom';

class App extends Component{

  render(){

    return (
      <div className="App">
        <Routes>
          <Route exact path='/lesson/new' Component={LessonForm}></Route>
        </Routes>
        <input placeholder='dd'></input>
      </div>
      
    );
  }
}



export default App;
