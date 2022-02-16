---
title: "Shared user profiles API overview"
description: "Shared user profiles APIs in Microsoft Graph allow users control over their information that is stored in other Azure AD tenants."
author: "adimitui"
ms.localizationpriority: medium
ms.prod: "identity-and-sign-in"
doc_type: conceptualPageType
---

# Shared user profiles API overview

Namespace: microsoft.graph

Azure AD cross-tenant collaboration allows you to securely share your company's applications and services with guest users (vendors, partners, or suppliers) from other organizations and enhances productivity. This collaboration is bi-directional: external users and organizations can collaborate with you (**inbound access**) and your users collaborate with external organizations (**outbound access**). During this collaboration, the user's identification information crosses tenant boundaries. However, the organization must maintain its information privacy commitments in the lifetime of this collaboration. Such commitments can include the General Data Protection Regulation (GDPR).

The [shared user profiles APIs]() in Microsoft Graph allow users control over their information that is stored in other Azure AD tenants. This control is enabled through the APIs that are supported by the [outboundSharedUserProfile](outboundshareduserprofile.md) and [inboundSharedUserProfile](inboundshareduserprofile.md) resources.

Consider two Azure AD tenants, Fabrikam and Contoso. Contoso is a tenant that is external to you (Fabrikam). Users in Fabrikam and Contoso collaborate in shared projects and their information is therefore stored in at least two tenants. In this scenario, a user from Contoso accessing resources in Fabrikam is **inbound access**; while a user from Fabrikam accessing resources in Contoso is **outbound access**.


<!-- The following scenarios need validation, especially the exportPersonalData and removePersonalData actions -->
## Outbound access and API scenarios
Managing data stored due to outbound access (from Fabrikam) is supported by the [outboundSharedUserProfile](outboundshareduserprofile.md) resource and related methods. You can complete the following scenarios using the methods supported by this resource.

+ A user from Fabrikam can enumerate all Azure AD tenants where their information is stored, including Contoso.
+ A user from Fabrikam can call the removePersonalData API to remove their information from Contoso. 
+ When a user's account and information has been deleted from the Fabrikam tenant, the Fabrikam administrator can delete the user's data from Contoso.

>**Note:** These are the underlying APIs for the **Organizations** page of the [My account](https://myaccount.microsoft.com) portal.

### Example: Retrieve all Azure AD tenants where your information is stored

#### Request

```msgraph-interactive

```

#### Response

```http
HTTP/1.1 200 OK
Content-Type: application/json


```

## Inbound access and API scenarios

Managing data stored in due to inbound access (to Fabrikam) is supported by the [inboundSharedUserProfile](inboundshareduserprofile.md) resource and related methods. You can complete the following scenarios using the methods supported by this resource:

+ A service in Fabrikam is compromised and information for guest users from Fabrikam may potentially have been leaked. The Fabrikam admin can retrieve all external users whose profiles are shared with Fabrikam, including users from Contoso. With a **userPrincipalName**, the admin can reach out to the users and to the Contoso admin to notify them about the breach.
+ To understand what information Contoso stores about them, a user from Fabrikam may invoke the [exportPersonalData](../api/inboundshareduserprofile-exportpersonaldata.md) method against the Fabrikam tenant to export their personal information to a specified database.
+ A collaboration project between Fabrikam and Contoso has ended and there's no longer need for a user from Contoso to access any of Fabrikam's resources. Because the Fabrikam tenant has disabled the **Leave organization** self-service feature for guests on the [My account](https://myaccount.microsoft.com) portal, the Fabrikam administrator must manually remove the user's information. The Fabrikam administrator will call the [removePersonalData](../api/inboundshareduserprofile-removepersonaldata.md) action against the user's ID.

### Example: Retrieve all users from external Azure AD tenants whose information is shared with you

#### Request

```msgraph-interactive

```

#### Response

```http
HTTP/1.1 200 OK
Content-Type: application/json


```

## Permission requirements

The shared user profiles APIs support both delegated and app-only scenarios with user or admin consent required for the following permissions:

| Operation | Permission | Authentication context |
|--|--|--|
|  | CrossTenantUserProfileSharing.Read | Delegated |
|  | CrossTenantUserProfileSharing.Read.All | Delegated, App-only |
|  | CrossTenantUserProfileSharing.ReadWrite | Delegated |
|  | CrossTenantUserProfileSharing.ReadWrite.All | Delegated, App-only |

For more information, see the [cross-tenant user profile sharing permissions](/graph/permissions-reference).

## Other related APIs

The shared user profiles APIs return the basic information about the outbound or inbound users, including a tenant identifier for their home tenant.

The following sample shows an example of a response object when you call the [List inboundSharedUserProfiles](../api/directory-list-inboundshareduserprofiles.md) method.

```http
HTTP/1.1 200 OK
Content-Type: application/json


```

The following sample shows an example of a response object when you call the [List outboundSharedUserProfiles](../api/directory-list-outboundshareduserprofiles.md) method.

```http
HTTP/1.1 200 OK
Content-Type: application/json


```

Using the identifier of the inbound user's home tenant (**homeTenantId**) or the tenantId identified in a user's outbound tenants, call the [findTenantInformationById](../api/tenantrelationship-findtenantinformationbytenantid.md) method to identify the domain name and other basic details about the tenant.