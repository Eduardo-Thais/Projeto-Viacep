<template>
  <v-container fluid>
    <v-row  >
      <v-col >
        <v-img
          src="CEPsearch.png"
          class="my-3"
          contain
          height="200"
        />
      </v-col>
      <v-form v-on:submit.prevent="onSubmit">
        <v-col >

          <v-text-field 
          v-model="procura"
          label="Pesquisa"
          ></v-text-field>
          
          <v-btn color="green" @click="procuraCep" >pesquisar</v-btn>
        
        </v-col>
      </v-form>
        
    </v-row>

    <v-row>
      <v-col>
        <enderecoSalvo :cepRetorno="cep" />
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
const axios = require('axios').default;
import enderecoSalvo from "./EnderecoSalvo";


  export default {
    name: 'buscaCep',

    components: {
    enderecoSalvo
    },

    data: () => {
      return {
        cep: [],
        procura: '',
        
      }
    },
    
  methods: {
    
    procuraCep: function() {
          axios
          .get('https://viacep.com.br/ws/' + this.procura + '/json/')
          .then(response => (this.cep = response.data))
    }
  }, 
  }
</script>
