import Vue from 'vue';
import Vuetify from 'vuetify';
import App from './App.vue';
import 'vuetify/dist/vuetify.min.css';
import 'babel-polyfill';
import router from './router';

Vue.use(Vuetify);

(() => new Vue({
  el: '#app',
  router,
  render: h => h(App),
}))();
