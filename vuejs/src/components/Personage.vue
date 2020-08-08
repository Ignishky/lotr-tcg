<template>
  <span>
    <card v-if="equipmentId" :id="this.equipmentId" />
    <card :id="this.personageId" v-bind:class="{withEquipment: hasEquipment}" />
  </span>
</template>

<script>
import Card from "@/components/Card";

export default {
  name: "Personage",

  components: {
    Card
  },

  props: {
    personageId: String,
    equipmentId: String
  },

  computed: {
    hasEquipment: function() {
      return this.equipmentId != null;
    }
  }
};
</script>

<style scoped>
.withEquipment {
  margin-left: -285px;
}
</style>
