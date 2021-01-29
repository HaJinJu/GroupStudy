import React from 'react';
import ReactDOM from 'react-dom';
import Array from './Test/Array';
import Basic from './Test/Basic';
import ConstLetSymbol from './Test/ConstLetSymbol';
import DataType from './Test/DataType';
import ForTest from './Test/ForTest';
import IfTest from './Test/IfTest';
import JsonType from './Test/JsonType';
import TypeOf from './Test/TypeOf';

ReactDOM.render(
  <React.StrictMode>
    <Basic />
    <DataType />
    <Array />
    <JsonType />
    <IfTest />
    <ForTest />
    <TypeOf />
    <ConstLetSymbol />
  </React.StrictMode>,
  document.getElementById('root')
);
