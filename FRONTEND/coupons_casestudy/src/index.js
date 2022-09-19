import React from "react";
import { BrowserRouter } from 'react-router-dom';

import {createRoot} from 'react-dom/client';

import App from './App';
import * as serviceWorker from "./serviceWorker";
// 👇️ IMPORTANT: use correct ID of your root element
// this is the ID of the div in your index.html file
const rootElement = document.getElementById('root');
const root = createRoot(rootElement);

// 👇️ if you use TypeScript, add non-null (!) assertion operator
// const root = createRoot(rootElement!);

root.render(
  <BrowserRouter>
    <App />
  </BrowserRouter>,
);
serviceWorker.unregister();