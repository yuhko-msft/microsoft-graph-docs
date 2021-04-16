---
title: "Create deviceConfigurationUserStatus"
description: "Create a new deviceConfigurationUserStatus object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceConfigurationUserStatus
Namespace: microsoft.graph



Create a new deviceConfigurationUserStatus object.

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
POST /deviceManagement/deviceConfigurations/{deviceConfigurationId}/rootCertificate/userStatuses
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) object.

The following table shows the properties that are required when you create the [deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|devicesCount|Int32|Devices count for that user.|
|lastReportedDateTime|DateTimeOffset|Last modified date time of the policy report.|
|status|complianceStatus|Compliance status of the policy report. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|userDisplayName|String|User name of the DevicePolicyStatus.|
|userPrincipalName|String|UserPrincipalName.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_deviceconfigurationuserstatus_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceConfigurations/{deviceConfigurationId}/rootCertificate/userStatuses
Content-Type: application/json
Content-length: 239

{
  "@odata.type": "#microsoft.graph.deviceConfigurationUserStatus",
  "devicesCount": "Integer",
  "lastReportedDateTime": "String (timestamp)",
  "status": "String",
  "userDisplayName": "String",
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceConfigurationUserStatus"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceConfigurationUserStatus",
  "id": "d93b1b3e-1b3e-d93b-3e1b-3bd93e1b3bd9",
  "devicesCount": "Integer",
  "lastReportedDateTime": "String (timestamp)",
  "status": "String",
  "userDisplayName": "String",
  "userPrincipalName": "String"
}
```

