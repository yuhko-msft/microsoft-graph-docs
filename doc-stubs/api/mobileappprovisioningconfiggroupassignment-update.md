---
title: "Update mobileAppProvisioningConfigGroupAssignment"
description: "Update the properties of a mobileAppProvisioningConfigGroupAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update mobileAppProvisioningConfigGroupAssignment
Namespace: microsoft.graph



Update the properties of a [mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) object.

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
PATCH /deviceAppManagement/iosLobAppProvisioningConfigurations/{iosLobAppProvisioningConfigurationId}/groupAssignments/{mobileAppProvisioningConfigGroupAssignmentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) object.

The following table shows the properties that are required when you update the [mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|targetGroupId|String|The ID of the AAD group in which the app provisioning configuration is being targeted.|



## Response

If successful, this method returns a `200 OK` response code and an updated [mobileAppProvisioningConfigGroupAssignment](../resources/mobileappprovisioningconfiggroupassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_mobileappprovisioningconfiggroupassignment"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceAppManagement/iosLobAppProvisioningConfigurations/{iosLobAppProvisioningConfigurationId}/groupAssignments/{mobileAppProvisioningConfigGroupAssignmentId}
Content-Type: application/json
Content-length: 114

{
  "@odata.type": "#microsoft.graph.mobileAppProvisioningConfigGroupAssignment",
  "targetGroupId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.mobileAppProvisioningConfigGroupAssignment",
  "id": "dfdd45de-45de-dfdd-de45-dddfde45dddf",
  "targetGroupId": "String"
}
```

