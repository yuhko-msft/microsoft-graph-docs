---
description: "Automatically generated file. DO NOT MODIFY"
---

```python

// THE PYTHON SDK IS IN PREVIEW. NON-PRODUCTION USE ONLY
client =  GraphServiceClient(request_adapter)

query_params = ExecutionScopeRequestBuilder.ExecutionScopeRequestBuilderGetQueryParameters(
		select = ["id"],
)

request_configuration = ExecutionScopeRequestBuilder.ExecutionScopeRequestBuilderGetRequestConfiguration(
query_parameters = query_params,
)


result = await client.identity_governance.lifecycle_workflows.workflows.by_workflow_id('workflow-id').execution_scope.get(request_configuration = request_configuration)


```