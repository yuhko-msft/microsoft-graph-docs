---
title: "Get access using the secure application model"
description: "Getting access to Microsoft Graph non-interactively when multi-factor authentication is required using the secure application model."
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# Using the secure application model with Microsoft Graph

Multi-factor authentication helps safeguard access to data and applications while maintaining simplicity for users. It provides additional security by requiring a second form of authentication and delivers strong authentication through a range of easy to use authentication methods. When multi-factor authentication is required the method used to request an access token to interact with Microsoft using delegated permissions needs to be modified. Leveraging the secure application model, you will be able to request an access token non-interactively and fulfill the requirement for multi-factor authentication.

## Secure application model

Contending with the requirement to provide a second factor authentication when interacting non-interactively with Microsoft Graph using delegated permissions, is made possible with this authentication. Implementing this form of authentication is done using the following two steps.

| Step | Description |
| ---- | ----------- |
| Consent  | This where you will authenticate interactively using the [authorization code flow](/azure/active-directory/develop/v2-oauth2-auth-code-flow) or [device code flow](/azure/active-directory/develop/v2-oauth2-device-code). The response from Azure Active Directory will contain an access token and a refresh token. The refresh token value should be stored somewhere secure, such as [Azure Key Vault](/azure/key-vault/key-vault-whatis). This value will be used by your application, or script, instead of user credential when authenticating.  |
| Exchange | Using the securely stored refresh token, generated through the consent step, you will request a new access token from Azure Active Directory. See [refresh the access token](/azure/active-directory/develop/v2-oauth2-auth-code-flow#refresh-the-access-token) for more information regarding the refresh token value. |

> [!IMPORTANT]
> By default, the lifetime of a refresh token is 90 days. So, it is important that you have a process for updating the refresh token prior to the expiration. If it does expire, you will receive an error similar to the following when attempting to exchange it for an access token *The refresh token has expired due to inactivity. The token was issued on 2019-01-02T09:19:53.5422744Z and was inactive for 90.00:00:00*.
