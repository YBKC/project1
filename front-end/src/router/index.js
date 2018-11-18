import Vue from 'vue';
import VueRouter from 'vue-router';
import Main from '../components/Main.vue';
import Analysis from '../components/Analysis.vue';

Vue.use(VueRouter);

const router = new VueRouter({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'Main',
      component: Main,
    },
    {
      path: '/analysis',
      name: 'Analysis',
      component: Analysis,
    },
  ],
});

export default router;
