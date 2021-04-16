---
title: "List windowsDefenderApplicationControlSupplementalPolicy"
description: "Get the windowsDefenderApplicationControlSupplementalPolicy resources from the policy navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List windowsDefenderApplicationControlSupplementalPolicy
Namespace: microsoft.graph



Get the windowsDefenderApplicationControlSupplementalPolicy resources from the policy navigation property.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /deviceAppManagement/wdacSupplementalPolicies/{windowsDefenderApplicationControlSupplementalPolicyId}/deviceStatuses/{windowsDefenderApplicationControlSupplementalPolicyDeploymentStatusId}/policy
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_windowsdefenderapplicationcontrolsupplementalpolicy"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceAppManagement/wdacSupplementalPolicies/{windowsDefenderApplicationControlSupplementalPolicyId}/deviceStatuses/{windowsDefenderApplicationControlSupplementalPolicyDeploymentStatusId}/policy
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.windowsDefenderApplicationControlSupplementalPolicy)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.windowsDefenderApplicationControlSupplementalPolicy",
      "id": "5a79b310-b310-5a79-10b3-795a10b3795a",
      "content": "Binary",
      "contentFileName": "String",
      "creationDateTime": "String (timestamp)",
      "description": "String",
      "displayName": "String",
      "lastModifiedDateTime": "String (timestamp)",
      "roleScopeTagIds": [
        "String"
      ],
      "version": "String"
    }
  ]
}
```

