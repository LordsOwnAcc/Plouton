export const getCategories = (req, res) => {
  res.json([
    "Roads",
    "Lighting",
    "Water Supply",
    "Cleanliness",
    "Public Safety",
    "Obstructions"
  ]);
};
