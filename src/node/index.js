var MilkCocoa = require('milkcocoa');
var milkcocoa = new MilkCocoa('xxxxx.mlkcca.com');
var ds = milkcocoa.dataStore('xxx');

ds.on('send', function(sended) {
//  console.log('sendされました！titleは'+sended.value.title+'contentは'+sended.value.value.index1);
  console.log(sended.value.value);
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
