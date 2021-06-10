<template>
  <v-container>
    <v-row class="text-center">
      <v-col cols="12">
        <v-img
          src="CEPsearch.png"
          class="my-3"
          contain
          height="200"
        />
      </v-col>
      <v-form v-on:submit.prevent="onSubmit">
        <v-col class="mb-4">

          <v-text-field 
          v-model="procura"
          label="Pesquisa"
          ></v-text-field>
          
          <v-btn color="green" >pesquisar</v-btn>
          </v-col>
      </v-form>
        <v-col class="mb-5">
          <p> {{ cep }} </p>
        </v-col>
        
    </v-row>
  </v-container>
</template>

<script>
//const axios = require('axios').default;

  export default {
    name: 'HelloWorld',

    data: () => {
      return {
        cep: [],
        procura: ''
      }
    },
    
  methods: {
    
    procuraCep: function(procura) {

          console.log(procura)
          //axios
          //.get('https://viacep.com.br/ws/' + procura + '/json/')
          //.then(response => (this.cep = response.data))
    }
  }
  }
</script>
