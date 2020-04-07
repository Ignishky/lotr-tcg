<template>
  <img :alt="this.cardNumber" :src="this.image" />
</template>

<script>
import images from "@/services/ImageService";
import backend from "@/services/BackendService";

export default {
  name: "Card",

  props: {
    id: String
  },

  data() {
    return {
      name: null,
      cardNumber: null,
      image: null
    };
  },

  created() {
    backend
      .getCard(this.id)
      .then(response => {
        this.name = response.data.name;
        this.cardNumber = response.data.cardNumber;
        this.image = images.getImage(this.cardNumber);
      })
      .catch(() => {
        this.name = null;
        this.cardNumber = null;
        this.image = null;
      });
  }
};
</script>
