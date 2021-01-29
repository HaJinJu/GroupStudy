import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import FirstEX_1 from "./data_type/FirstEX_1";
import FirstEX_3 from "./data_type/FirstEX_3";
import FirstEX_2 from "./data_type/FirstEX_2";

ReactDOM.render(
  <React.StrictMode>
    <FirstEX_1/>
    <FirstEX_2/>
    <FirstEX_3/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
