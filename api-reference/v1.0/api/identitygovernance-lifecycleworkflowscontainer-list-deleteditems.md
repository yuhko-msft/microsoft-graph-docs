---
title: "List deletedItems (deleted lifecycle workflows)"
description: "Get a list of the deleted workflows objects and their properties."
author: "AlexFilipin"
ms.localizationpriority: medium
ms.prod: "governance"
doc_type: apiPageType
---

# List deletedItems (deleted lifecycle workflows)

Namespace: microsoft.graph

Get a list of the deleted workflow objects and their properties.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|LifecycleWorkflows.Read.All, LifecycleWorkflows.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|LifecycleWorkflows.Read.All, LifecycleWorkflows.ReadWrite.All|

[!INCLUDE [rbac-lifecycle-workflows-apis-read](../includes/rbac-for-apis/rbac-lifecycle-workflows-apis-read.md)]

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /identityGovernance/lifecycleWorkflows/deletedItems/workflows/
```

## Optional query parameters

This method supports the `$select`, `$search`, `$orderBy`, and `$filter` OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers

|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [microsoft.graph.identityGovernance.workflow](../resources/identitygovernance-workflow.md) objects in the response body.

## Examples

### Example 1: Retrieve all deleted workflows

#### Request

The following is an example of a request.

<!-- {
  "blockType": "request",
  "name": "lifecycleworkflows_list_deleteditemcontainer"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/identityGovernance/lifecycleWorkflows/deletedItems/workflows
```

#### Response

The following is an example of the response.
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.deletedItemContainer)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "@odata.context": "https://graph.microsoft.com/v1.0/$metadata#identityGovernance/lifecycleWorkflows/deletedItems/workflows",
    "value": [
        {
            "category": "joiner",
            "description": "Configure new hire tasks for onboarding employees on their first day",
            "displayName": "US Onboard new hire employee",
            "lastModifiedDateTime": "2022-08-24T18:25:09.4212828Z",
            "createdDateTime": "2022-08-24T18:24:14.4067873Z",
            "deletedDateTime": "2022-08-24T18:25:09.5729865Z",
            "id": "f1937e0c-c509-4250-ab51-d5e6e35fcbda",
            "version": 1
        },
        {
            "category": "joiner",
            "description": "Configure new hire tasks for onboarding employees on their first day",
            "displayName": "EU Onboard new hire employee",
            "lastModifiedDateTime": "2022-08-24T18:25:09.4050443Z",
            "createdDateTime": "2022-08-24T18:24:40.0689833Z",
            "deletedDateTime": "2022-08-24T18:25:09.5542954Z",
            "id": "21d2c0fb-dcaa-4abb-88db-891d76c84e9a",
            "version": 1
        }
    ]
}
```

### Example 2: Retrieve deleted workflows for "leaver" scenarios and return only specific properties

#### Request

The following is an example of a request.

<!-- {
  "blockType": "request",
  "name": "lifecycleworkflows_list_deleteditemcontainer_select"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/identityGovernance/lifecycleWorkflows/deletedItems/workflows?$select=id,category,displayName,description,version&$filter=category eq 'leaver'
```

#### Response

The following is an example of the response.
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.deletedItemContainer)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "@odata.context": "https://graph.microsoft.com/v1.0/$metadata#identityGovernance/lifecycleWorkflows/deletedItems/workflows(category,displayName,description,version)",
    "value": [
        {
            "category": "leaver",
            "description": "Employee offboarding for Contoso Germany.",
            "displayName": "Germany offboard employees",
            "id": "952b23c5-cc25-48c9-8848-95da4dd9dc6d",
            "version": 4
        }
    ]
}
```
