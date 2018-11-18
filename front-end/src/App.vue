<template>
  <v-app
    id="app"
    dark>
    <v-navigation-drawer
      v-model="drawer"
      clipped
      fixed
      app
    >
      <v-list dense>
        <v-list-tile>
          <v-list-tile-action>
            <v-icon>dashboard</v-icon>
          </v-list-tile-action>
          <v-list-tile-content>
            <v-list-tile-title>
              <router-link
                to="/" class="menu_label">
                Overview
              </router-link>
            </v-list-tile-title>
          </v-list-tile-content>
        </v-list-tile>
        <v-list-tile>
          <v-list-tile-action>
            <v-icon>equalizer</v-icon>
          </v-list-tile-action>
          <v-list-tile-content>
            <v-list-tile-title>
              <router-link
                to="/analysis" class="menu_label">
                Analysis
              </router-link>
            </v-list-tile-title>
          </v-list-tile-content>
        </v-list-tile>
      </v-list>
    </v-navigation-drawer>
    <v-toolbar
      app
      fixed
      clipped-left>
      <v-toolbar-side-icon @click.stop="drawer = !drawer" />
      <v-toolbar-title>Application</v-toolbar-title>
    </v-toolbar>
    <v-content>
      <v-container
        fluid
        fill-height>
        <v-layout
          justify-center
          align-center>
          <router-view />
        </v-layout>
      </v-container>
    </v-content>
    <v-footer
      app
      fixed>
      <span>&copy; 2017</span>
    </v-footer>
  </v-app>
</template>

<script>
export default {
  props: {
    source: {
      type: String,
      default: '',
    },
  },
  data: () => ({
    drawer: null,
  }),
};
</script>

<style scoped>
.menu_label {
  text-decoration: none;
  color: white;
}
</style>
