import React, { useEffect, useState } from 'react';
import './App.css';
import axios from 'axios';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faMagnifyingGlass } from '@fortawesome/free-solid-svg-icons'


export default () => {
  const [location, setLocation] = useState({});
  const [data, setData] = useState(false);

  const getData = async (e) => {
    await axios.get(`https://api.openweathermap.org/data/2.5/weather?q=${location}&appid=c9ec27be5089ad46413256b56ca664fd&units=metric`)
      .then((res) => {
        console.log(res.data)
        setData(res.data)
      })
  }
  let showIconImg = () => {
    let iconId = data.weather[0].icon;
    let icons = <img className='iconIMG' src={`http://openweathermap.org/img/wn/${iconId}@2x.png`} />
    return icons
  }
  let showTHS = () => {
    return (<div className='dataTHS-container'>
      <div className='dataTHS'>
        <p className='dataTHS-p'>Temperature</p>
        <p className='dataTHS-p'>{data === false ? '' : data.main.temp + '°C'}</p>
      </div>
      <div className='dataTHS'>
        <p className='dataTHS-p'>Humidity</p>
        <p className='dataTHS-p'>{data === false ? '' : data.main.humidity + '%'}</p>
      </div>
      <div className='dataTHS'>
        <p className='dataTHS-p'>Wind speed</p>
        <p className='dataTHS-p'>{data === false ? '' : data.wind.speed + ' m/s'}</p>
      </div>
    </div>)
  }

  function calcTime(offset) {
    // creamos el objeto Date (la selecciona de la máquina cliente)
    let d = new Date();

    // lo convierte  a milisegundos
    // añade la dirferencia horaria
    // recupera la hora en formato UTC
    let utc = d.getTime() + (d.getTimezoneOffset() * 60000);

    // crea un nuevo objeto Date usando la diferencia dada.
    let nd = new Date(utc + (3600000 * offset));
    return nd.toLocaleString()
  }
  const prevent = (e) => {
    e.preventDefault()
  }
  return (
    <div className="app" style={{ overflow: 'hidden' }} >
      <div className={data === false ? 'noDisplayNav' : 'navBar'}>
        <div className='logo'>WeatherApp</div>
        <form onSubmit={prevent}>
          <input placeholder='Enter a other location' className='input-form' type='text' onChange={e => setLocation(e.target.value)}></input>
          <button className='button-form' type='submit' onClick={getData}><FontAwesomeIcon icon={faMagnifyingGlass} /></button>
        </form>
        <div>{data === false ? '' : calcTime((data.timezone / 60) / 60)}</div>
      </div>
      <div style={data === false ? { display: 'flex', justifyContent: 'center', alignItems: 'center', width: '100vw', height: '100vh' } : { display: 'none' }}>
        <section className='section'>
          <div className='logo1'>WeatherApp</div>
          <form style={{ display: 'flex', justifyContent: 'center', flexWrap: 'nowrap' }} onSubmit={prevent}>
            <input placeholder='Enter a location' className='input-form1' type='text' onChange={e => setLocation(e.target.value)}></input>
            <button className='button-form1' type='submit' onClick={getData}><FontAwesomeIcon icon={faMagnifyingGlass} /></button>
          </form>
        </section>
      </div>

      <div style={{ display: 'flex', justifyContent: 'center', alignItems: 'center', width: '100vw', height: '100%' }}>
        <div className={data === false ? 'nomain' : 'main'}>
          <div className='name'>
            <p className='name-p'>{data === false ? '' : data.name + ', '}{data === false ? '' : data.sys.country}</p>
          </div>
          <div className='icon'>
            {data === false ? '' : showIconImg()}
            <p className='description'>{data === false ? '' : data.weather[0].description}</p>

          </div>
          <div className='down-container'>
            {data === false ? '' : showTHS()}
          </div>
        </div>
      </div>



    </div>)
}


