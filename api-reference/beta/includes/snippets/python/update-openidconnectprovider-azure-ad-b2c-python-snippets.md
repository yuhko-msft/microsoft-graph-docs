---
description: "Automatically generated file. DO NOT MODIFY"
---

```python

// THE PYTHON SDK IS IN PREVIEW. NON-PRODUCTION USE ONLY
client =  GraphServiceClient(request_adapter)

request_body = IdentityProvider()
additional_data = [
'response_type' => 'id_token', 
];
request_body.additional_data(additional_data)





result = await client.identity_providers.by_identity_provider_id('identityProvider-id').patch(request_body = request_body)


```