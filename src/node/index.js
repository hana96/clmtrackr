var MilkCocoa = require('milkcocoa');
var milkcocoa = new MilkCocoa('hotitl5z6gd.mlkcca.com');
var ds = milkcocoa.dataStore('position');

ds.on('send', function(sended) {
//  console.log('sendされました！titleは'+sended.value.title+'contentは'+sended.value.value.index1);
  console.log(sended.value.content);
});

// // sended
// {
//     id: [String],
//     timestamp: [Number],
//     value: {
//         title: 'hoge',
//         content: 'huga'
//     }
// }

// ds.stream().next(function(err, messages){
//   console.log(messages);
//   /*
//   messages -> [{
//     id: [String],
//     timestamp: [Number],
//     value: {
//         title: '...',
//         content: '...'
//     }
//   },
//   {
//     id: [String],
//     timestamp: [Number],
//     value: {
//         title: '...',
//         content: '...'
//     }
//   },
//   ...
//   ]
//   */
// });
