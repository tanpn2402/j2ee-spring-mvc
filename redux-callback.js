// redux call back

// in actions
export const register = (p, callback) => dispatch => {
    post("login", {"loginID":"555555","password":"ttl1234567","captcha":"123"})
        .then(data => {
            setTimeout(() => {
                callback(data)
            }, 2000)
        })
}


// in component
this.props.login(1, (e) => {
    this.setState({ loadingLogin: false })
})




// fetch
export const post = (action, params) => {
    let url = SERVER + action
	
    return fetch(url, {
        method: POST,
        headers: HEADERS,
        credentials: 'include',
        body: JSON.stringify(params)
    })
    .then((response) => response.json())
}
