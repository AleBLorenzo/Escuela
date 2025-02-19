const mongoose = require('mongoose');
const TaskSchema = new mongoose.Schema({
  userId: { type: mongoose.Schema.Types.ObjectId, ref: 'User', required: true },
  title: { type: String, required: true },
  description: String,
  createdAt: { type: Date, default: Date.now },
});
const Task = mongoose.model('Task', TaskSchema);
module.exports = Task;