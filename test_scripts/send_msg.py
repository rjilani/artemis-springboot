import requests

url = 'http://localhost:8080/send'

headers = {
        'Accept': 'application/text',
        'Content-Type': 'application/text'
    }

response = requests.request("POST", url, data='helllo Rashid', verify=False)
print(response.text)

