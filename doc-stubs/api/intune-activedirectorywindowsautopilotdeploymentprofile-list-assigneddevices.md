---
title: "List assignedDevices"
description: "Get the windowsAutopilotDeviceIdentity resources from the assignedDevices navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List assignedDevices
Namespace: microsoft.graph

Get the windowsAutopilotDeviceIdentity resources from the assignedDevices navigation property.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET /deviceManagement/windowsAutopilotDeviceIdentities
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

If successful, this method returns a `200 OK` response code and a collection of [windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windowsautopilotdeviceidentity"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/windowsAutopilotDeviceIdentities
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.windowsAutopilotDeviceIdentity)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.graph.windowsAutopilotDeviceIdentity",
      "id": "a18627e8-27e8-a186-e827-86a1e82786a1",
      "deploymentProfileAssignmentStatus": "String",
      "deploymentProfileAssignmentDetailedStatus": "String",
      "deploymentProfileAssignedDateTime": "String (timestamp)",
      "orderIdentifier": "String",
      "groupTag": "String",
      "purchaseOrderIdentifier": "String",
      "serialNumber": "String",
      "productKey": "String",
      "manufacturer": "String",
      "model": "String",
      "enrollmentState": "String",
      "lastContactedDateTime": "String (timestamp)",
      "addressableUserName": "String",
      "userPrincipalName": "String",
      "resourceName": "String",
      "skuNumber": "String",
      "systemFamily": "String",
      "azureActiveDirectoryDeviceId": "String",
      "managedDeviceId": "String",
      "displayName": "String"
    }
  ]
}
```

