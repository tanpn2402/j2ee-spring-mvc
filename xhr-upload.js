export const upload = (p, callback) => {

  var xhr = new XMLHttpRequest()
  xhr.open("POST", "http://localhost:3003/upload", true)

  xhr.upload.onprogress = function(e)
  {
      let percentComplete = Math.ceil((e.loaded / e.total) * 100)
      callback(percentComplete)
  }

  xhr.upload.onloadend = (e) => {
      // console.log(e)
  }

  xhr.setRequestHeader("Content-Type", "application/json");

  fetch(p.preview.url)
      .then((response) => {
          response.arrayBuffer().then((buffer) => {
              var base64Flag = 'data:image/jpeg;base64,';
              var imageStr = arrayBufferToBase64(buffer);

              xhr.send(JSON.stringify({
                  filename: "acb.png",
                  base64: base64Flag + imageStr
              }))
          })
      })
}

function arrayBufferToBase64(buffer) {
    var binary = '';
    var bytes = [].slice.call(new Uint8Array(buffer));
  
    bytes.forEach((b) => binary += String.fromCharCode(b));
  
    return window.btoa(binary);
}
