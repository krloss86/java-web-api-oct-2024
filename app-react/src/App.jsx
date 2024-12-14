import { useEffect, useState } from 'react'

import './App.css'// hoja de estilos css
import Producto from './Producto';
import Data from './Data';
import ListadoProducto from './ListadoProducto';

const NOMBRES = ['gianmarco','pablo','matias','silvia','luis','carlos'];
const PRODUCTO = {
  id: Math.random(),
  titulo: 'UN PRODUCTO X',
  codigo : 'codigox',
  precio: 1500.5,
  tipo: {
    id: 1,
    descripcion: 'TIPO 1'
  }
};

/*const PRODUCTOS = [
  {
    id: Math.random(),
    titulo: 'UN PRODUCTO X',
    codigo : 'codigox',
    precio: 1500.5,
    tipo: {
      id: 1,
      descripcion: 'TIPO 1'
    }
  },
  {
    id: Math.random(),
    titulo: 'UN PRODUCTO y',
    codigo : 'codigox',
    precio: 2500.5,
    tipo: {
      id: 2,
      descripcion: 'TIPO 2'
    }
  }
];
*/

function App() {

  /*estado */
  const [contador,setContador] = useState(0) //hook
  const [nombres,setNombres] = useState(NOMBRES);
  const [producto,setProducto] = useState(PRODUCTO)
  const [productos,setProductos] = useState([])
  
  const [json,setJson] = useState(undefined);

  /*funcion dentro el componente */
  const incrementar = () => {
    if(contador < 10) {
      setContador(contador + 1);
    }
  }
  
  // decrementar hasta 0
  const decrementar = () => {
    if(contador > 0) {
      setContador(contador - 1);
    }
  }
  /*
  useEffect(()=> {
    console.log('useEffect sin deps');
  });
  */
  useEffect(()=> {
    console.log('useEffect array vacio, solo una vez');
    // cargar datos de un api rest externo
    fetch('https://reqres.in/api/unknown') //funcion nativa de javascrip para hacer peticiones asincronas
      .then(response => response.json()) 
      .then(data => setJson(data))    
  },[]);

  useEffect(()=> {
    console.log('useEffect array vacio, solo una vez');
    // cargar datos de un api rest externo
    fetch('http://localhost:8080/app-rest-server/api/producto') //funcion nativa de javascrip para hacer peticiones asincronas
      .then(response => response.json()) 
      .then(data => setProductos(adapat(data)))    
  },[]);

  const adapat = (response) => {
    const convertidos = response.map(r => { 
      return {
          id: r.id,
          titulo: r.titulo,
          codigo: r.codigo,
          precio: r.precio,
          tipo: {
            id: r.tipoProducto.id,
            descripcion: r.tipoProducto.descripcion
          }
        }
      }
    );
    return convertidos;
  }
  /*
  useEffect(()=> {
    console.log('useEffect cada vez que cambia una dep');
  },[contador]);
  */

  /*jsx*/
  return (
    /*fragment */
    /*asociar un cli evento a un elemento*/
    <>
      <button onClick={incrementar}>
        +
      </button>
      { contador}
      <button onClick={decrementar}>
        -
      </button>   
      <hr/>
      <ul>
        {
          nombres.map(n => <li key={n}>{n}</li>)
        }
      </ul>
      <hr/>
      <Producto 
        producto={producto}
      />
      <hr/>
      {productos.length > 0 &&
        <ListadoProducto productos={productos}/>
      }
      <hr/>
      { json && <Data json={json}/>}
    </>
  )
}

export default App
