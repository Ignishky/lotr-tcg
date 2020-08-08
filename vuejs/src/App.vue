<template>
  <div id="app">
    <personage personageId="01290" equipmentId="01001"/>
    <personage personageId="01364" />
  </div>
</template>

<script>
import Personage from '@/components/Personage'

export default {
  name: 'App',

  components: {
    Personage
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
