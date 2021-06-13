<template>
  <v-app>
    <v-app-bar
      app
      color="light-green"
      dark
    >
      <div class="d-flex align-center">
        <v-img
          alt="Vuetify Logo"
          class="shrink mr-2"
          contain
          src="CEPsearch.png"
          transition="scale-transition"
          width="40"
        />
      </div>

      <v-spacer></v-spacer>

    </v-app-bar>

    <v-main>

      <BuscaCep/>

    </v-main>
  </v-app>
</template>

<script>
import BuscaCep from './components/buscaCep';

export default {
  name: 'App',

  components: {
    BuscaCep,
  },

  data: () => ({
    //
  }),
};
</script>
