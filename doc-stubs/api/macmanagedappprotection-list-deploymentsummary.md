---
title: "List managedAppPolicyDeploymentSummary"
description: "Get the managedAppPolicyDeploymentSummary resources from the deploymentSummary navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List managedAppPolicyDeploymentSummary
Namespace: microsoft.graph

Get the managedAppPolicyDeploymentSummary resources from the deploymentSummary navigation property.

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
GET /deviceAppManagement/macManagedAppProtections/{macManagedAppProtectionId}/deploymentSummary
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

If successful, this method returns a `200 OK` response code and a collection of [managedAppPolicyDeploymentSummary](../resources/managedapppolicydeploymentsummary.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_managedapppolicydeploymentsummary"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceAppManagement/macManagedAppProtections/{macManagedAppProtectionId}/deploymentSummary
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.managedAppPolicyDeploymentSummary)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.managedAppPolicyDeploymentSummary",
      "id": "d0f7650c-650c-d0f7-0c65-f7d00c65f7d0",
      "displayName": "String",
      "configurationDeployedUserCount": "Integer",
      "lastRefreshTime": "String (timestamp)",
      "configurationDeploymentSummaryPerApp": [
        {
          "@odata.type": "microsoft.graph.managedAppPolicyDeploymentSummaryPerApp"
        }
      ],
      "version": "String"
    }
  ]
}
```

