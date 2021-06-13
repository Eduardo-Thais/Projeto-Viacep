<template>
  <div>
      <v-row no-gutters>
        <v-col cols="12">
            
            <v-card
            color="#385F73"
            dark
            >
            <v-card-title class="text-h5">
              CEP
            </v-card-title>

            <p>{{ cepRetorno.cep }}</p>
            <p>{{ cepRetorno.logradouro }}</p>
            <p>{{ cepRetorno.complemento }}</p>

            <p>{{ cepRetorno.bairro }}</p>
            <p>{{ cepRetorno.localidade }}</p>
            <p>{{ cepRetorno.uf }}</p>
            <p>{{ cepRetorno.ibge }}</p>
            <p>{{ cepRetorno.gia }}</p>
            <p>{{ cepRetorno.ddd }}</p>

            <p>{{ cepRetorno.siafi }}</p>
            
          </v-card>
            
        </v-col>
      </v-row>
  </div>
</template>

<script>
export default {
    props: {
        cepRetorno: { type: Object[Array], required: true }
    }
    

};
</script>

<style>

</style>