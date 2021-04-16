---
title: "Update unifiedRoleManagementPolicyNotificationRule"
description: "Update the properties of an unifiedRoleManagementPolicyNotificationRule object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update unifiedRoleManagementPolicyNotificationRule
Namespace: microsoft.graph



Update the properties of an [unifiedRoleManagementPolicyNotificationRule](../resources/unifiedrolemanagementpolicynotificationrule.md) object.

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
PATCH /unifiedRoleManagementPolicyNotificationRule
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unifiedRoleManagementPolicyNotificationRule](../resources/unifiedrolemanagementpolicynotificationrule.md) object.

The following table shows the properties that are required when you update the [unifiedRoleManagementPolicyNotificationRule](../resources/unifiedrolemanagementpolicynotificationrule.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[unifiedRoleManagementPolicyRuleTarget](../resources/unifiedrolemanagementpolicyruletarget.md)|**TODO: Add Description** Inherited from [unifiedRoleManagementPolicyRule](../resources/unifiedrolemanagementpolicyrule.md)|
|isDefaultRecipientsEnabled|Boolean|**TODO: Add Description**|
|notificationLevel|String|**TODO: Add Description**|
|notificationRecipients|String collection|**TODO: Add Description**|
|notificationType|String|**TODO: Add Description**|
|recipientType|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [unifiedRoleManagementPolicyNotificationRule](../resources/unifiedrolemanagementpolicynotificationrule.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_unifiedrolemanagementpolicynotificationrule"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/unifiedRoleManagementPolicyNotificationRule
Content-Type: application/json
Content-length: 374

{
  "@odata.type": "#microsoft.graph.unifiedRoleManagementPolicyNotificationRule",
  "target": {
    "@odata.type": "microsoft.graph.unifiedRoleManagementPolicyRuleTarget"
  },
  "isDefaultRecipientsEnabled": "Boolean",
  "notificationLevel": "String",
  "notificationRecipients": [
    "String"
  ],
  "notificationType": "String",
  "recipientType": "String"
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
  "@odata.type": "#microsoft.graph.unifiedRoleManagementPolicyNotificationRule",
  "id": "da065c28-5c28-da06-285c-06da285c06da",
  "target": {
    "@odata.type": "microsoft.graph.unifiedRoleManagementPolicyRuleTarget"
  },
  "isDefaultRecipientsEnabled": "Boolean",
  "notificationLevel": "String",
  "notificationRecipients": [
    "String"
  ],
  "notificationType": "String",
  "recipientType": "String"
}
```

