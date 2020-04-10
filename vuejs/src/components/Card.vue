<template>
  <img :alt="this.number" :src="this.image" />
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
      number: null,
      image: null
    };
  },

  created() {
    backend
      .getCard(this.id)
      .then(response => {
        this.name = response.data.name;
        this.number = response.data.number;
        this.image = images.getImage(this.number);
      })
      .catch(() => {
        this.name = null;
        this.number = null;
        this.image = null;
      });
  }
};
</script>
